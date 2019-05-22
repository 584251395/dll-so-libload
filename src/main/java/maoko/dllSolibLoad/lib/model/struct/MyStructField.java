package maoko.dllSolibLoad.lib.model.struct;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * struct字段
 * 
 * @author fanpei
 *
 */
@Deprecated
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyStructField {

	/**
	 * 字段名称
	 * 
	 * @return
	 */
	String value() default "";
}
