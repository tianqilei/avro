/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Usr extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Usr\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"sex\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"age\",\"type\":\"int\",\"default\":0},{\"name\":\"friendship\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"visit\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"address\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String sex;
  @Deprecated public int age;
  @Deprecated public java.util.List<java.lang.String> friendship;
  @Deprecated public java.util.List<java.lang.String> visit;
  @Deprecated public java.util.List<java.lang.String> address;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Usr() {}

  /**
   * All-args constructor.
   */
  public Usr(java.lang.String name, java.lang.String sex, java.lang.Integer age, java.util.List<java.lang.String> friendship, java.util.List<java.lang.String> visit, java.util.List<java.lang.String> address) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.friendship = friendship;
    this.visit = visit;
    this.address = address;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return sex;
    case 2: return age;
    case 3: return friendship;
    case 4: return visit;
    case 5: return address;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: sex = (java.lang.String)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: friendship = (java.util.List<java.lang.String>)value$; break;
    case 4: visit = (java.util.List<java.lang.String>)value$; break;
    case 5: address = (java.util.List<java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'sex' field.
   */
  public java.lang.String getSex() {
    return sex;
  }

  /**
   * Sets the value of the 'sex' field.
   * @param value the value to set.
   */
  public void setSex(java.lang.String value) {
    this.sex = value;
  }

  /**
   * Gets the value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'friendship' field.
   */
  public java.util.List<java.lang.String> getFriendship() {
    return friendship;
  }

  /**
   * Sets the value of the 'friendship' field.
   * @param value the value to set.
   */
  public void setFriendship(java.util.List<java.lang.String> value) {
    this.friendship = value;
  }

  /**
   * Gets the value of the 'visit' field.
   */
  public java.util.List<java.lang.String> getVisit() {
    return visit;
  }

  /**
   * Sets the value of the 'visit' field.
   * @param value the value to set.
   */
  public void setVisit(java.util.List<java.lang.String> value) {
    this.visit = value;
  }

  /**
   * Gets the value of the 'address' field.
   */
  public java.util.List<java.lang.String> getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.util.List<java.lang.String> value) {
    this.address = value;
  }

  /** Creates a new Usr RecordBuilder */
  public static avro.Usr.Builder newBuilder() {
    return new avro.Usr.Builder();
  }
  
  /** Creates a new Usr RecordBuilder by copying an existing Builder */
  public static avro.Usr.Builder newBuilder(avro.Usr.Builder other) {
    return new avro.Usr.Builder(other);
  }
  
  /** Creates a new Usr RecordBuilder by copying an existing Usr instance */
  public static avro.Usr.Builder newBuilder(avro.Usr other) {
    return new avro.Usr.Builder(other);
  }
  
  /**
   * RecordBuilder for Usr instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Usr>
    implements org.apache.avro.data.RecordBuilder<Usr> {

    private java.lang.String name;
    private java.lang.String sex;
    private int age;
    private java.util.List<java.lang.String> friendship;
    private java.util.List<java.lang.String> visit;
    private java.util.List<java.lang.String> address;

    /** Creates a new Builder */
    private Builder() {
      super(avro.Usr.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.Usr.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sex)) {
        this.sex = data().deepCopy(fields()[1].schema(), other.sex);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.friendship)) {
        this.friendship = data().deepCopy(fields()[3].schema(), other.friendship);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.visit)) {
        this.visit = data().deepCopy(fields()[4].schema(), other.visit);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.address)) {
        this.address = data().deepCopy(fields()[5].schema(), other.address);
        fieldSetFlags()[5] = true;
        
      }
    }
    
    /** Creates a Builder by copying an existing Usr instance */
    private Builder(avro.Usr other) {
            super(avro.Usr.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sex)) {
        this.sex = data().deepCopy(fields()[1].schema(), other.sex);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.friendship)) {
        this.friendship = data().deepCopy(fields()[3].schema(), other.friendship);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.visit)) {
        this.visit = data().deepCopy(fields()[4].schema(), other.visit);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.address)) {
        this.address = data().deepCopy(fields()[5].schema(), other.address);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public avro.Usr.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public avro.Usr.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'sex' field */
    public java.lang.String getSex() {
      return sex;
    }
    
    /** Sets the value of the 'sex' field */
    public avro.Usr.Builder setSex(java.lang.String value) {
      validate(fields()[1], value);
      this.sex = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'sex' field has been set */
    public boolean hasSex() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'sex' field */
    public avro.Usr.Builder clearSex() {
      sex = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'age' field */
    public java.lang.Integer getAge() {
      return age;
    }
    
    /** Sets the value of the 'age' field */
    public avro.Usr.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'age' field has been set */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'age' field */
    public avro.Usr.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'friendship' field */
    public java.util.List<java.lang.String> getFriendship() {
      return friendship;
    }
    
    /** Sets the value of the 'friendship' field */
    public avro.Usr.Builder setFriendship(java.util.List<java.lang.String> value) {
      validate(fields()[3], value);
      this.friendship = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'friendship' field has been set */
    public boolean hasFriendship() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'friendship' field */
    public avro.Usr.Builder clearFriendship() {
      friendship = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'visit' field */
    public java.util.List<java.lang.String> getVisit() {
      return visit;
    }
    
    /** Sets the value of the 'visit' field */
    public avro.Usr.Builder setVisit(java.util.List<java.lang.String> value) {
      validate(fields()[4], value);
      this.visit = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'visit' field has been set */
    public boolean hasVisit() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'visit' field */
    public avro.Usr.Builder clearVisit() {
      visit = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'address' field */
    public java.util.List<java.lang.String> getAddress() {
      return address;
    }
    
    /** Sets the value of the 'address' field */
    public avro.Usr.Builder setAddress(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.address = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'address' field has been set */
    public boolean hasAddress() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'address' field */
    public avro.Usr.Builder clearAddress() {
      address = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Usr build() {
      try {
        Usr record = new Usr();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.sex = fieldSetFlags()[1] ? this.sex : (java.lang.String) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.friendship = fieldSetFlags()[3] ? this.friendship : (java.util.List<java.lang.String>) defaultValue(fields()[3]);
        record.visit = fieldSetFlags()[4] ? this.visit : (java.util.List<java.lang.String>) defaultValue(fields()[4]);
        record.address = fieldSetFlags()[5] ? this.address : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
