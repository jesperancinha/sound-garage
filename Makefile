build:
	mvn clean install
coverage:
	mvn clean install jacoco:prepare-agent package jacoco:report
	mvn omni-coveragereporter:report
play:
	mvn clean install -DskipTests
	java -jar sg-generator/target/sg-generator.jar
