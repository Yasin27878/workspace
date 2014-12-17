/*
	与类文件类似,接口文件中只能有一个public接口,并且接口名==文件名
	接口--->实现类--->对象
*/
public interface USB{
	//组成
	//int test; 必须赋值
	double version = 3.0;//默认的修饰符 public static final
	void read();		 //默认修饰		public abstract	
	void write();		 //	
	
}