@echo off
kotlinc -include-runtime -d calculadora.jar calculadora.kt && java -jar calculadora.jar