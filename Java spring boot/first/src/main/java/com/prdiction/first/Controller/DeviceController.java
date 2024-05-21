package com.prdiction.first.Controller;

import com.prdiction.first.Models.Device;

import com.prdiction.first.Service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("devices")
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }

    @GetMapping("devices/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable Long id) {
        Device device = deviceService.getDeviceById(id);
        if (device == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(device);
    }


    @PostMapping("devices")
    public ResponseEntity<Device> createDevice(@RequestBody Device device) {
        System.out.println(device);
        Device savedDevice = deviceService. addDevice(device);  // Assume saveDevice saves the device and returns it
        return ResponseEntity.ok(savedDevice);
    }
    @GetMapping("/predict/{deviceId}")
    @Transactional
    public Double  predictDevicePrice(@PathVariable Long deviceId) {
        Device device = deviceService.getDeviceById(deviceId);
        return deviceService.callPythonApi(device);
    }
}
