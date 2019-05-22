package maoko.dllSolibLoad.lib.load.ifs;

import com.sun.jna.Library;

import maoko.dllSolibLoad.lib.load.LibLoad;
import maoko.dllSolibLoad.lib.model.struct.meta.StruFileTime;
import maoko.dllSolibLoad.lib.model.struct.meta.StruTarget;

/**
 * 加载动态库接口
 * 
 * @author fanpei
 *
 */
@LibLoad(linuxName = "libCTest", windowsName = "CTest")
public interface ICTest extends Library {

	/**
	 * 求和
	 * 
	 * @param a 数据a
	 * @param b 数据b
	 * @return 返回两数之和
	 */
	int sum(int a, int b);

	/**
	 * 手动处理数据
	 * 
	 * @param ftStartTime 开始时间
	 * @param ftEndTime   结束时间
	 * @param pTarget     待处理数组的地址
	 * @param nNum        待处理数组个数
	 * @return
	 */
	int Target_Manual(StruFileTime.ByValue ftStartTime, StruFileTime.ByValue ftEndTime, StruTarget.ByReference pTarget,
			int nNum);

	/**
	 * 注册回调-用于异步返回数据
	 * 
	 * @param func
	 * @return
	 */
	int RegisterReceiveDataCallBack(ICallBack func);

	/**
	 * 回调接口
	 * 
	 * @author fanpei
	 *
	 */
	public interface ICallBack {

		/**
		 * 回调函数
		 * 
		 * @param targets 结果数据
		 * @param nNum    结果个数
		 * @return
		 */
		public abstract int ReceiveCrossData(StruTarget.ByReference targets, int nNum);
	}
}
