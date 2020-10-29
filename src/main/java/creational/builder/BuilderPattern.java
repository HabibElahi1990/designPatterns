package creational.builder;

/**
 * Created by h.elahi on 08/11/2018.
 */

/**
 * create class BuilderPattern for builder pattern design pattern
 * this class add values by diff prototypes and finally return object of Builder Class
 * sample of design pattern is StringBuilder
 **/
public class BuilderPattern {

    private String stringValue;
    private Integer intValue;
    private Long longValue;
    private Character charValue;
    private Float floatValue;


    public BuilderPattern value(Character charValue) {
        this.charValue = charValue;
        return this;
    }


    public BuilderPattern value(Float floatValue) {
        this.floatValue = floatValue;
        return this;
    }


    public BuilderPattern value(Integer intValue) {
        this.intValue = intValue;
        return this;
    }


    public BuilderPattern value(Long longValue) {
        this.longValue = longValue;
        return this;
    }


    public BuilderPattern value(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    public Builder builder() {
        Builder builder = new Builder();
        builder.setCharValue(this.charValue);
        builder.setFloatValue(this.floatValue);
        builder.setIntValue(this.intValue);
        builder.setLongValue(this.longValue);
        builder.setStringValue(this.stringValue);
        return builder;
    }

}
