1. Create the new directory:
mkdir target

2. Compile the program:
javac `find . -name "*.java"` -d target

3. Copy image:
cp -R src/resources target/

4. Create jar:
jar cmf src/manifest.txt target/images-to-chars-printer.jar -C target .

5. Run the program
java -jar target/images-to-chars-printer.jar . 0