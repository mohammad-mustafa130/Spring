package aop.performance;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TestResults {
    public long advisedMethodTime;
    public long unadvisedMethodTime;
    public long equalsTime;
    public long hashCodeTime;
    public long proxyTargetTime;

    @Override
    public String toString() {
        return "TestResults " + new ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE)
                        .append("advised", advisedMethodTime)
                        .append("unadvised", unadvisedMethodTime)
                        .append("equals", equalsTime)
                        .append("hashCode", hashCodeTime)
                        .append("getProxyTargetClass", proxyTargetTime)
                        .toString();
    }
}