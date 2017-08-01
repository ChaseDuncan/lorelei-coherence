CP="./target/dependency/*:./target/classes/:./dist/*"
ANNOTATED_DATA="../geonames/scripts/amh_test_annotated.txt"

mvn dependency:copy-dependencies
mvn install -DskipTests

java -Xmx10G -cp $CP edu.illinois.cs.cogcomp.loreleicoherence.CoherenceTests $ANNOTATED_DATA
