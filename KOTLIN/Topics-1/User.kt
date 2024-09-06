import java.io.FileOutputStream

fun main()
{
    println("Enter your first name: ")
    var firstname:String = readLine().toString()

    println("Enter your last name: ")
    var lastname:String = readLine().toString()

    println("Enter your email: ")
    var email:String = readLine().toString()


    println("Enter your password: ")
    var password:String = readLine().toString()

    var fname1 = "\n Your Firstname: "
    var lname1 = "\n Your Lastname: "
    var email1 = "\n Your Email: "
    var pass1 = "\n Your Password:"


    var fout = FileOutputStream("D://vishv.txt")
    fout.write(fname1.toByteArray())
    fout.write(firstname.toByteArray())
    fout.write(lname1.toByteArray())
    fout.write(lastname.toByteArray())
    fout.write(email1.toByteArray())
    fout.write(email.toByteArray())
    fout.write(pass1.toByteArray())
    fout.write(password.toByteArray())

    println("success")
}