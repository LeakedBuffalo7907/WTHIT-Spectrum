package io.github.haykam821.breakprogress;

import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class JadeAgeComponentProvider implements IBlockComponentProvider {
	private static final MinecraftClient CLIENT = MinecraftClient.getInstance();

	@Override
	public void appendTail(ITooltip tooltip, IBlockAccessor accessor, IPluginConfig config) {
		int age = 0;
		tooltip.addLine(Text.translatable("text.wailaSpectrum.jadeage", age));
	}
}
