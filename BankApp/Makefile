MAIN  := Main
SRC   := $(wildcard src/*.java src/*/*.java)
BIN   := bin

.PHONY: compile run clean

compile:
	javac -d $(BIN) $(SRC)

run: compile
	java -cp $(BIN) $(MAIN)

clean:
	rm -rf $(BIN)
