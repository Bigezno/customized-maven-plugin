import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Created by liuqi on 2018/12/9.
 */
@Mojo(name = "helloMoJo", defaultPhase= LifecyclePhase.PACKAGE)
public class HelloMoJo extends AbstractMojo {

	/**
	 *  该方法就是用来定义这个 Mojo 具体操作内容，我们只需要根据自己的需要来编写自己的实现即可。
	 * @throws MojoExecutionException
	 * @throws MojoFailureException
	 */
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("hello mojo");
	}
}
