package com.prdiction.first.Service;

import com.prdiction.first.Models.Device;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;


import java.util.List;


import com.prdiction.first.api.PythonApiClient;

@Service
public class DeviceService {


    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private PythonApiClient pythonApiClient;



    public List<Device> getAllDevices() {

        return deviceRepository.findAll();
    }

    public Device getDeviceById(Long id) {

        return deviceRepository.findById(id).orElse(null);
    }

    @Transactional
    public Device addDevice(Device device) {
        deviceRepository.save(device);
        return device;
    }

    public double callPythonApi(Device device) {

        Double predictedPrice = pythonApiClient.predictDevicePrice(device).block();
        if (predictedPrice != null) {
            System.out.println("Predicted Price: " + predictedPrice);
            return predictedPrice;
        } else {
            System.out.println("Received null predicted price from Python API");
            return 0.0;
        }


    }


}
