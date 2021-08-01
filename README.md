COSCUP 2021 - Make Your First JVM Compiler
---------
如何建置：
1. git clone 這個專案。
2. gradle建置。
3. 將io.github.chaosunity.Compiler設定為Application的Main class，或是使用Intellij IDEA直接點擊io.github.chaosunity.Compiler的main method左方的run。
4. run完後可以至examples直接執行class，無任何輸出是正常的。
---------
What's next?
1. 可以將想要實作的語法先行用java寫好編譯並反編譯`javap -c <source>`
2. 觀察bytecode instructions
3. 將你的語法加入g4檔案，並建構好語法分析/編譯至JVM Bytecode流程。
