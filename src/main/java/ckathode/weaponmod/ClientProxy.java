package ckathode.weaponmod;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy {

	public static void init() {
		System.out.println("[Realms of Chaos] Registering Renderers");

		Renderers.init();

	}
}