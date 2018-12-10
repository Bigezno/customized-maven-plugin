import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.*;
import java.util.List;

/**
 * Created by liuqi on 2018/12/9.
 */
@Mojo(name = "parameterMoJo", defaultPhase= LifecyclePhase.PACKAGE)
public class ParameterMoJO extends AbstractMojo {
	
	
	@Parameter( property = "sayhi.greeting", defaultValue = "Hello World!" )
	private String message;
	
	@Parameter
	private List<Integer> numbers;
	
	@Parameter
	private String[] names;
	
	
	@Parameter
	private File file;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("自定义参数:" + message);
		
		if (numbers != null) {
			for (Integer number : numbers) {
				System.out.println("numbers:" + number);
			}
		}
		
		if (names != null) {
			for (String name : names) {
				System.out.println("name:" + name);
			}
		}
		
		if (file != null) {
			System.out.println(file.getAbsolutePath());
			try {
				BufferedReader reader = new BufferedReader(new BufferedReader(new FileReader(file.getAbsoluteFile())));
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				
			} catch (IOException e) {
				System.out.println(e);
			}
			
		}
	}
}
