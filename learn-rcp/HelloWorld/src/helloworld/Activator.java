package helloworld;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * �Բ�����������ڽ��й�������Ϊ�����
 * û��UI�Ĳ����̳� AbstractUIPlugin �ĸ��� Plugin �Ϳ�����
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

	// �����ʼʱ�Ĵ���
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	// ���ֹͣʱ�Ĵ���
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 *  instance ʵ��
	 *  ȡ�ò����ʵ���ķ���
	 *  ������ǵ����ģ��������������Ϊһ����̬�����ṩ
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
