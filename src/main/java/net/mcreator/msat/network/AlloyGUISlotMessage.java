
package net.mcreator.msat.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.msat.world.inventory.AlloyGUIMenu;
import net.mcreator.msat.procedures.OtherothethingProcedure;
import net.mcreator.msat.MsatMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record AlloyGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) implements CustomPacketPayload {

	public static final Type<AlloyGUISlotMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MsatMod.MODID, "alloy_gui_slots"));
	public static final StreamCodec<RegistryFriendlyByteBuf, AlloyGUISlotMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, AlloyGUISlotMessage message) -> {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}, (RegistryFriendlyByteBuf buffer) -> new AlloyGUISlotMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<AlloyGUISlotMessage> type() {
		return TYPE;
	}

	public static void handleData(final AlloyGUISlotMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = AlloyGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 2 && changeType == 1) {

			OtherothethingProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MsatMod.addNetworkMessage(AlloyGUISlotMessage.TYPE, AlloyGUISlotMessage.STREAM_CODEC, AlloyGUISlotMessage::handleData);
	}
}
