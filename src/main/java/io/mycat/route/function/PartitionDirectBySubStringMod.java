package io.mycat.route.function;

import java.math.BigInteger;

import io.mycat.config.model.rule.RuleAlgorithm;

/**
 * 根据字符子串（必须是数字）取模计算分区号。
 * 
 * @author 51
 * 
 * <function name="sub" class="org.opencloudb.route.function.PartitionDirectBySubString">
 * <property name="startIndex">9</property> <!-- zero-based -->
 * <property name="size">2</property>
 * <property name="partitionCount">8</property>
 * </function>
 */
public class PartitionDirectBySubStringMod extends AbstractPartitionAlgorithm implements RuleAlgorithm {
    /**  */
    private static final long serialVersionUID = 7594620306916555529L;

    // 字符子串起始索引（zero-based)
    private int               startIndex;
    // 字串长度
    private int               size;
    // 分区数量
    private int               partitionCount;

    public void setStartIndex(String str) {
        startIndex = Integer.parseInt(str);
    }

    public void setSize(String str) {
        size = Integer.parseInt(str);
    }

    public void setPartitionCount(String partitionCount) {
        this.partitionCount = Integer.parseInt(partitionCount);
    }

    @Override
    public void init() {

    }

    @Override
    public Integer calculate(String columnValue) {
        String partitionSubString = columnValue.substring(startIndex, startIndex + size);
        BigInteger partition = new BigInteger(partitionSubString);
        return (partition.mod(BigInteger.valueOf(partitionCount))).intValue();
    }

    @Override
    public int getPartitionNum() {
        int nPartition = this.partitionCount;
        return nPartition;
    }

}
