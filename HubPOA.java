package SecuritySystem;


/**
* SecuritySystem/HubPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SecuritySystem.idl
* Tuesday, 23 May 2017 17:43:20 o'clock BST
*/

public abstract class HubPOA extends org.omg.PortableServer.Servant
 implements SecuritySystem.HubOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("sensorAlert", new java.lang.Integer (0));
    _methods.put ("sensorOnOff", new java.lang.Integer (1));
    _methods.put ("cameraAlert", new java.lang.Integer (2));
    _methods.put ("sensorReset", new java.lang.Integer (3));
    _methods.put ("logAlarm", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // SecuritySystem/Hub/sensorAlert
       {
         String name = in.read_string ();
         String room = in.read_string ();
         this.sensorAlert (name, room);
         out = $rh.createReply();
         break;
       }

       case 1:  // SecuritySystem/Hub/sensorOnOff
       {
         String name = in.read_string ();
         String room = in.read_string ();
         boolean onOff = in.read_boolean ();
         this.sensorOnOff (name, room, onOff);
         out = $rh.createReply();
         break;
       }

       case 2:  // SecuritySystem/Hub/cameraAlert
       {
         String name = in.read_string ();
         String room = in.read_string ();
         this.cameraAlert (name, room);
         out = $rh.createReply();
         break;
       }

       case 3:  // SecuritySystem/Hub/sensorReset
       {
         String name = in.read_string ();
         String room = in.read_string ();
         this.sensorReset (name, room);
         out = $rh.createReply();
         break;
       }

       case 4:  // SecuritySystem/Hub/logAlarm
       {
         String log = in.read_string ();
         this.logAlarm (log);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SecuritySystem/Hub:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Hub _this() 
  {
    return HubHelper.narrow(
    super._this_object());
  }

  public Hub _this(org.omg.CORBA.ORB orb) 
  {
    return HubHelper.narrow(
    super._this_object(orb));
  }


} // class HubPOA
