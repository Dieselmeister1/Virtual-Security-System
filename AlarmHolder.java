package SecuritySystem;

/**
* SecuritySystem/AlarmHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SecuritySystem.idl
* Wednesday, 19 April 2017 20:44:28 o'clock BST
*/

public final class AlarmHolder implements org.omg.CORBA.portable.Streamable
{
  public SecuritySystem.Alarm value = null;

  public AlarmHolder ()
  {
  }

  public AlarmHolder (SecuritySystem.Alarm initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SecuritySystem.AlarmHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SecuritySystem.AlarmHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SecuritySystem.AlarmHelper.type ();
  }

}
