package creational.builder;

/**
 * Created by h.elahi on 08/11/2018.
 */
//this class used in BuilderPattern Class
public class Builder {
    private String stringValue;
    private Integer intValue;
    private Long longValue;
    private Character charValue;
    private Float floatValue;

    public Character getCharValue() {
        return charValue;
    }

    public void setCharValue(Character charValue) {
        this.charValue = charValue;
    }

    public Float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "stringValue='" + stringValue + '\'' +
                ", intValue=" + intValue +
                ", longValue=" + longValue +
                ", charValue=" + charValue +
                ", floatValue=" + floatValue +
                '}';
    }
}
