package com.xuexiang.xtcpdemo.protocol.test.indefiniteArray;

import com.xuexiang.xtcp.annotation.ProtocolField;
import com.xuexiang.xtcp.core.model.XProtocolItem;

import static com.xuexiang.xtcp.model.ProtocolInfo.byte2HexString;

/**
 * 不定长数组测试【String】
 *
 * @author xuexiang
 * @since 2018/12/24 上午9:25
 */
public class TestStringItem extends XProtocolItem {

    @ProtocolField(index = 0)
    private byte func1;
    @ProtocolField(index = 1)
    private short func2;
    @ProtocolField(index = 2, charset = "GBK")
    private String string;
    @ProtocolField(index = 3)
    private int func3;
    @ProtocolField(index = 4)
    private long func4;


    public TestStringItem setFunc1(byte func1) {
        this.func1 = func1;
        return this;
    }

    public TestStringItem setFunc2(short func2) {
        this.func2 = func2;
        return this;
    }

    public TestStringItem setFunc3(int func3) {
        this.func3 = func3;
        return this;
    }

    public TestStringItem setFunc4(long func4) {
        this.func4 = func4;
        return this;
    }

    public TestStringItem setString(String string) {
        this.string = string;
        return this;
    }

    @Override
    public String toString() {
        return "TestStringItem{" +
                "func1=" + byte2HexString(func1) +
                ", func2=" + func2 +
                ", string='" + string + '\'' +
                ", func3=" + func3 +
                ", func4=" + func4 +
                '}';
    }
}
