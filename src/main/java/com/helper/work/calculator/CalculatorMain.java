package com.helper.work.calculator;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Slf4j
public class CalculatorMain {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            processFile(reader);
        } catch (FileNotFoundException e) {
            log.info("File not found - " + e.getMessage());
        } catch (IOException e) {
            log.info("Error reading file - " + e.getMessage());
        } catch (Exception e) {
            log.info("Error processing file - " + e.getMessage());
        }
    }

    private static void processFile(BufferedReader reader) throws IOException {
        String inputLine = null;
        while ((inputLine = reader.readLine()) != null) {
            performOperation(inputLine);
        }
    }

    private static void performOperation(String inputLine) {
        String[] parts = inputLine.split(" ");
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        int left = Integer.parseInt(parts[1]);
        int right = Integer.parseInt(parts[2]);
        int result = execute(operation, left, right);

        log.info(operation + " of " + left + " " + operation.getValue() + " " + right + " = " + result);
    }

    private static int execute(MathOperation operation, int left, int right) throws IllegalArgumentException {
        int result = 0;
        switch (operation) {
            case ADD:
                result = left + right;
                break;
            case SUBTRACT:
                result = left - right;
                break;
            case MULTIPLY:
                result = left * right;
                break;
            case DIVIDE:
                if (right == 0) {
                    throw new IllegalArgumentException("Division cannot have a zero as divider");
                }
                result = left / right;
                break;
        }
        return result;
    }
}
