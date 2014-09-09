package cxf.server;

import javax.xml.ws.Endpoint;

import org.apache.cxf.endpoint.EndpointImpl;

import cxf.WsInterface;
import cxf.impl.WsImpl;

public class CxfServer {
	public static void main(String[] args) {
		WsInterface ws = new WsImpl();
		EndpointImpl ep =  (EndpointImpl)Endpoint.publish(
				"http://localhost:9093/ws", ws);
		
	}
}
