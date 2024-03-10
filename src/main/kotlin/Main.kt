package org.example
class Student(
    val age: Int,
    val name: String,
    val surname: String,
    val grade: String
) {
     class StudentBuilder(
         private var age: Int = 0,
         private var name: String = "",
         private var surname: String = "",
         private var grade: String = ""
    ) {
        fun age(age: Int): StudentBuilder {
            this.age = age
            return this
        }

        fun name(name: String): StudentBuilder {
            this.name = name
            return this
        }

        fun surname(surname: String): StudentBuilder {
            this.surname = surname
            return this
        }

        fun grade(grade: String): StudentBuilder {
            this.grade = grade
            return this
        }

        fun build() = Student(age, name, surname, grade)
    }
}

fun main() {

    val student = Student
        .StudentBuilder()
        .age(20)
        .name("John")
        .surname("Smith")
        .grade("A")
        .build()

    val student2 = Student
        .StudentBuilder()
        .age(23)
        .name("Levon")
        .grade("F")
        .build()

    println("Student: ${student.name} ${student.surname}, Age: ${student.age}, Grade: ${student.grade}")
    println("Student: ${student2.name}, Age: ${student2.age}, Grade: ${student2.grade}")
}
