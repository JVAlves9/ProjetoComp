.PHONY: run

export CLASSPATH=antlr.jar:generated

run: generated/*.class
	java  Main

generated/*.class : *.java generated/*.java
	javac -d generated *.java generated/*.java

generated/*.java : Projeto.e4
	java -jar antlr.jar -o generated Projeto.e4
	java -jar antlr.jar -o generated DLS.e4
