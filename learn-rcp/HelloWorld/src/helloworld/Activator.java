package helloworld;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * 对插件的生命周期进行管理，被称为插件类
 * 没有UI的插件类继承 AbstractUIPlugin 的父类 Plugin 就可以了
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "HelloWorld"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	// 插件开始时的处理
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	// 插件停止时的处理
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 *  instance 实例
	 *  取得插件类实例的方法
	 *  插件类是单例的，所以这个方法作为一个静态方法提供
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
