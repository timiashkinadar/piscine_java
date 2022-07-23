1. Create the new directories:
mkdir target
mkdir lib

2. Download library:
curl -o lib/jcommander-1.82.jar https://repo1.maven.org/maven2/com/beust/jcommander/1.82/jcommander-1.82.jar
curl -o lib/JCDP-4.0.2.jar https://repo1.maven.org/maven2/com/diogonunes/JCDP/4.0.2/JCDP-4.0.2.jar

3. Compile the program:
javac -d target -sourcepath src/java -cp lib/JCDP-4.0.2.jar:lib/jcommander-1.82.jar:. src/java/edu/school21/printer/*/*.java

4. Copy image:
cp -R src/resources target/

5. Unpack Library:
jar -xf lib/jcommander-1.82.jar
jar -xf lib/JCDP-4.0.2.jar
rm -rf META-INF
mv com target

6. Create jar:
jar cmf src/manifest.txt target/images-to-chars-printer.jar -C target .

7. Run the program:
java -jar target/images-to-chars-printer.jar --white=RED --black=GREEN