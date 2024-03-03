package test;

public class test {
    public static void main(String[] args) {
        SmsService service = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        service.send("1");
    }
}