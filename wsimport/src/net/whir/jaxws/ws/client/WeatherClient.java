package net.whir.jaxws.ws.client;

import net.whir.jaxws.ws.WeatherInterfaceImpl;
import net.whir.jaxws.ws.WeatherInterfaceImplService;

public class WeatherClient {

	public static void main(String[] args) {
		//创建服务视图
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
		//获取服务实现类
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
		//调用查询方法并打印
		String weather = weatherInterfaceImpl.queryWeather("合肥");
		System.out.println(weather);
	}
}
