.PHONY: run

export CLASSPATH=antlr.jar:generated

run: generated/*.class
	java  Main config.ini

generated/*.class : *.java generated/*.java
	javac -d generated *.java generated/*.java

generated/*.java : Projeto.e4
	java -jar antlr.jar -o generated Projeto.e4

generated/*.java : DLS.e4
	java -jar antlr.jar -o generated DLS.e4
