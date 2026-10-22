package aop.performance;

public class TestResults {
    public long advisedMethodTime;
    public long unadvisedMethodTime;
    public long equalsTime;
    public long hashCodeTime;
    public long proxyTargetTime;
    @Override
    public String toString() {
        return "TestResults {" +
                "advisedMethodTime = " + advisedMethodTime +
                ", unadvisedMethodTime = " + unadvisedMethodTime +
                ", equalsTime = " + equalsTime +
                ", hashCodeTime = " + hashCodeTime +
                ", proxyTargetTime = " + proxyTargetTime +
                '}';
    }
}