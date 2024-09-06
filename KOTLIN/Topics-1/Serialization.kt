
import Student
import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun main()
{

    var fout = FileOutputStream("D://text.txt")
    var s1 = Student(101,"abcd")
    var out = ObjectOutputStream(fout)
    out.writeObject(s1)
    print("success")


}