package maoko.dllSolibLoad.lib.model.struct.meta;

import com.sun.jna.NativeLong;

import maoko.dllSolibLoad.lib.model.struct.JavaStructBase;

/**
 * 时间信息
 * 
 * @author fanpei
 *
 */
public class StruFileTime extends JavaStructBase {
	public NativeLong dwLowDateTime;// 开始时间
	public NativeLong dwHighDateTime;// 结束时间
}
