package com.prdiction.first.Service;

import com.prdiction.first.Models.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}