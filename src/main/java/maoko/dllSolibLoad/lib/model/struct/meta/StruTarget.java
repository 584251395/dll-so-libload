package maoko.dllSolibLoad.lib.model.struct.meta;

import maoko.dllSolibLoad.lib.model.struct.JavaStructBase;

/**
 * 目标信息
 * 
 * @author fanpei
 *
 */
public class StruTarget extends JavaStructBase {
	public int nFrq;// 频率
	public StruFileTime.ByValue ftFindTime; // 时间
	public float fLong; // 经度
	public float fLat; // 纬度
	public String szLoc; // 所属地名
}
