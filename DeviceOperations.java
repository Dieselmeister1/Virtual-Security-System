package SecuritySystem;


/**
* SecuritySystem/DeviceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SecuritySystem.idl
* Wednesday, 19 April 2017 20:44:28 o'clock BST
*/

public interface DeviceOperations 
{
  String name ();
  void name (String newName);
  String room ();
  void room (String newRoom);
  boolean status ();
  void status (boolean newStatus);
  boolean onOff ();
  void onOff (boolean newOnOff);
  SecuritySystem.Image currentImage ();
  void currentImage (SecuritySystem.Image newCurrentImage);
  void trigger ();
  void toggleOn ();
  void reset ();
} // interface DeviceOperations