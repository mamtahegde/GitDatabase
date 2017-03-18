mkdir bin
javac -cp jars/* -d bin src\db\*.java
java -cp bin;jars/* org.testng.TestNG testng.xml