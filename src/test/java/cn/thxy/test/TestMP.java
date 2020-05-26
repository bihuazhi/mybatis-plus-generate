package cn.thxy.test;

import org.junit.Test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class TestMP {
	
	@Test
	public void testGenerator(){
		//1.全局配置
		GlobalConfig config = new GlobalConfig();
		config.setActiveRecord(true) //是否支持AR模式
			  .setAuthor("bihuazhi")
			  .setOutputDir("D:\\javaSpace\\newTech\\mp02\\src\\main\\java")   //路径
			  .setFileOverride(true)   //文件覆盖
			  .setIdType(IdType.AUTO)  //主键策略
			  .setServiceName("%sService")  //设置生成的service接口的名字的首字母是否为I
			  .setBaseResultMap(true)  // IemployeeService
			  .setBaseColumnList(true);   //设置生成的列
		
		//2.数据源的配置
		DataSourceConfig dsConfig = new DataSourceConfig();
		dsConfig.setDbType(DbType.MYSQL)
				.setUrl("jdbc:mysql://localhost:3306/mp")
				.setDriverName("com.mysql.jdbc.Driver")
				.setUsername("root")
				.setPassword("123456");
		
		//3.策略配置
		StrategyConfig  strategyConfig = new StrategyConfig();
		strategyConfig.setCapitalMode(true); //全局大写命名
		strategyConfig.setDbColumnUnderline(true);  //指定字段是否使用下划线
		strategyConfig.setNaming(NamingStrategy.underline_to_camel) ; //使用下划线映射数据库的名称
		strategyConfig.setTablePrefix("tbl_");
		strategyConfig.setInclude("tbl_employee"); //生成的表
		
		//4.包名策略配置
		PackageConfig pkConfig = new PackageConfig();
		pkConfig.setParent("cn.thxy.mp");  //父包
		pkConfig.setMapper("mapper");  //子包
		pkConfig.setService("service");
		pkConfig.setController("controller");
		pkConfig.setEntity("domain");
		pkConfig.setXml("mapper");
		
		
		//5.整合配置
		AutoGenerator autoGenerator = new AutoGenerator();
		autoGenerator.setGlobalConfig(config);
		autoGenerator.setDataSource(dsConfig);
		autoGenerator.setStrategy(strategyConfig);
		autoGenerator.setPackageInfo(pkConfig);
		
		//6.执行方法
		autoGenerator.execute();
		
		
	}
}
