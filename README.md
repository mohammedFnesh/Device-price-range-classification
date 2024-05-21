# Devices Price Classification System

This project consists of two main components: a Python project for predicting device prices using machine learning and a Spring Boot project to manage device data and interact with the Python prediction service.

## Project Description

The Devices Price Classification System aims to classify the prices of devices based on their specifications. It includes two sub-projects:

1. **Python Project**: Implements the machine learning model to predict device prices.
2. **Spring Boot Project**: Manages device data and interacts with the Python service to get price predictions.

## Components

### Python Project

#### Dataset

The dataset includes the following columns:
- **id**: ID
- **battery_power**: Battery capacity in mAh
- **blue**: Bluetooth support (0 or 1)
- **clock_speed**: Microprocessor clock speed
- **dual_sim**: Dual SIM support (0 or 1)
- **fc**: Front camera megapixels
- **four_g**: 4G support (0 or 1)
- **int_memory**: Internal memory in GB
- **m_dep**: Mobile depth in cm
- **mobile_wt**: Weight of mobile phone
- **n_cores**: Number of processor cores
- **pc**: Primary camera megapixels
- **px_height**: Pixel resolution height
- **px_width**: Pixel resolution width
- **ram**: RAM in MB
- **sc_h**: Screen height in cm
- **sc_w**: Screen width in cm
- **talk_time**: Maximum battery life on a single charge
- **three_g**: 3G support (0 or 1)
- **touch_screen**: Touch screen support (0 or 1)
- **wifi**: WiFi support (0 or 1)
- **price_range**: Target variable with values:
  - 0: Low cost
  - 1: Medium cost
  - 2: High cost
  - 3: Very high cost

#### Modeling Steps

1. **Data Preparation**


2. **Exploratory Data Analysis (EDA)**

3. **Model Training**


4. **Model Evaluation**

5. **Model Optimization**
   - Optimize the model for better performance.
   - Add comments on the optimization techniques.

#### RESTful API

- Endpoint to predict the price of a device based on its specifications.

### Spring Boot Project

#### Entities

- **Device**: Represents each device in the system.

#### Endpoints

- `POST /api/devices/`: Retrieve a list of all devices.
- `GET /api/devices/{id}`: Retrieve details of a specific device by ID.
- `POST /api/devices`: Add a new device.
- `POST /api/predict/{deviceId}`: Predict the price of a device and save the result.

#### Testing

- Predict the prices for 10 devices from the test dataset.

#### Data Storage

- Choose any suitable database for data storage.

## Getting Started



### Setup Instructions

#### Python Project
# Django Project  

This project demonstrates the integration of a Django web application with `scikit-learn`, `numpy`, `pandas`, and `matplotlib` for building and visualizing machine learning models.

## Prerequisites

Ensure you have the following installed on your machine:

- Python 3.7 or higher
- Django 3.2 or higher
- pip (Python package installer)

#### Setup Instructions

### Step 1: Clone the Repository

Clone the repository to your local machine:

```sh
git clone <repository-url>
cd <repository-directory>
```
### Step 2: Create a Virtual Environment
Create and activate a virtual environment to manage dependencies:

```sh
Copy code
python -m venv venv
source venv/bin/activate  # On Windows use `venv\Scripts\activate`
```
### Step 3: Install Dependencies
Install the required Python packages:

``` sh
Copy code
pip install django scikit-learn numpy pandas matplotlib
 ```
### Step 4: Set Up Django Project
Navigate to the Django project directory and apply migrations:
```
sh
Copy code
cd <django-project-directory>
python manage.py migrate
```
### Step 5: Run the Django Development Server
Start the Django development server:
```
sh
Copy code
python manage.py runserver
 ``` 
# Java Project
- Spring Boot Project 
- Step 1 :Install intellij IDE 
- step 2 : open project using File -> Open 
- step 3 : Run project 
# Test Projects 

- step 1 : Run Django Project 
- step 2 : Run  Spring boot Project 
- step 3 : Run Mysql server
- step 4 : Open Postman
- step 5 : via Postman
- make request get and post reqest 
