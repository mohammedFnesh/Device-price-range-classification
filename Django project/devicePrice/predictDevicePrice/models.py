# price_prediction/models.py

from django.db import models

class Device(models.Model):

    id = models.IntegerField(primary_key=True)
    name=models.CharField(max_length=60)
    core=models.IntegerField()
    price=models.FloatField()
  

    def __str__(self):
        return f"Device {self.id}"
