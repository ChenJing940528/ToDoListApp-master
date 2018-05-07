package UserModule;



public interface UserOperations 
{
  boolean add(String startTime, String endTime, String label);
  String query(String startTime, String endTime);
  boolean delete(String key);
  boolean clear();
  String show();
} // interface UserOperations
