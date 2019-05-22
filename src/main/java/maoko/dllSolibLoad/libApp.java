package maoko.dllSolibLoad;

import maoko.common.system.AppRunPathUitl;
import maoko.dllSolibLoad.lib.load.JnaLibCall;
import maoko.dllSolibLoad.lib.load.LibFactory;
import maoko.dllSolibLoad.lib.load.ifs.ICTest;
import maoko.sdk.SDKCommon;

/**
 * Hello world!
 *
 */
public class libApp {
	public static void main(String[] args) {
		try {
			// 初始化
			AppRunPathUitl.initRunPath(libApp.class);
			SDKCommon.init();
			JnaLibCall.load();

			int result = LibFactory.get(ICTest.class).sum(2, 3);
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
