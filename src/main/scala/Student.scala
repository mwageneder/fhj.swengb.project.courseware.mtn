import java.sql.{Connection, Date, ResultSet}

import scala.collection.mutable.ListBuffer


object Student extends Db.DbEntity[Student] {
  def toDb(c: Connection)(s: Student) : Int = {
    val pstmt = c.prepareStatement(insertSql)
    pstmt.setString(1, s.id)
    pstmt.setString(2, s.title)
    pstmt.setString(3, s.firstname)
    pstmt.setString(4, s.lastname)
    pstmt.setString(5, s.birthdate)
    pstmt.setString(6, s.gender)
    pstmt.setString(7, s.address)
    pstmt.setString(8, s.zip)
    pstmt.setString(9, s.phone)
    pstmt.setString(10, s.email)
    pstmt.setString(11, s.group)
    pstmt.setInt(12, s.status)
    pstmt.executeUpdate()
  }

  def delFromDb(c: Connection)(prop: String) : Int = {
    val pstmt = c.prepareStatement(deleteSql + prop + "'")
    pstmt.executeUpdate()
  }

  def editFromDb(c: Connection)(s: Student, id:String) : Int = {
    val sql = "update dbo.student set student_id = '" + s.id + "', title = '" + s.title + "', firstname = '" + s.firstname +
      "', lastname = '" + s.lastname + "', birthdate = '" + s.birthdate + "', gender = '"  + s.gender +
      "', address = '" + s.address + "', zip_code = '" + s.zip + "', phone = '" + s.phone +
      "' , e_mail = '" + s.email + "' , group_nr = '" + s.group + "' , status = '" + s.status + "' where student_id = '" + id + "';"
    val pstmt = c.prepareStatement(sql)
    pstmt.executeUpdate()
  }

  def fromDb(rs: ResultSet): List[Student] = {
    val lb : ListBuffer[Student] = new ListBuffer[Student]()
    while (rs.next()) lb.append(Student(rs.getString("student_id"), rs.getString("title"), rs.getString("firstname"),
                                        rs.getString("lastname"), rs.getString("birthdate"), rs.getString("gender"),
                                        rs.getString("address"), rs.getString("zip_code"), rs.getString("phone"),
                                        rs.getString("e_mail"), rs.getString("group_nr"), rs.getInt("status")))
    lb.toList
  }

  def insertSql: String = "insert into dbo.student (student_id, title, firstname, lastname, birthdate, gender, " +
                          "address, zip_code, phone, e_mail, type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"

  def deleteSql: String = "delete from dbo.student where student_id = '"

  def queryAll(con: Connection): ResultSet = query(con)("select * from dbo.student")

}



case class Student(id:String, title:String, firstname:String, lastname:String, birthdate:String, gender:String,
                   address:String, zip:String, phone:String, email:String, group:String,
                   status:Int) extends Db.DbEntity[Student] {

  def toDb(c: Connection)(s: Student) : Int = 0

  def fromDb(rs: ResultSet): List[Student] = List()

  def delFromDb(c: Connection)(s: Student) : Int = 0

  def insertSql: String = ""
}