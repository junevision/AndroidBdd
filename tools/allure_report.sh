#!/bin/bash
rm -rf ./allure_reports
adb pull sdcard/Download/allure_results_demo ./allure_reports/
allure serve ./allure_reports