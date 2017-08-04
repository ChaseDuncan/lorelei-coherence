CP="./target/dependency/*:./target/classes/:./dist/*"
ANNOTATED_DATA="../geonames/scripts/amh_test_annotated.txt"
KB_PATH="../geonames/data/allCountries.txt"
DB_PATH="../geonames/data/test.db"
OUTPUT="test_out.txt"
mvn dependency:copy-dependencies
mvn install -DskipTests

java -Xmx10G -cp $CP edu.illinois.cs.cogcomp.loreleiedl.CoherenceTests $1 $KB_PATH $DB_PATH $ANNOTATED_DATA $OUTPUT
