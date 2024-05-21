from django.shortcuts import render

# Create your views here.
# price_prediction/views.py

from django.shortcuts import render
from django.http import JsonResponse
from .form import DeviceForm
from .models import Device
import pickle
loaded_model = pickle.load(open('model1.pkl', 'rb'))

# Make a prediction

def predict_price(request):
    if request.method  :
        return JsonResponse({'price_range':  1.5})
    if request.method == 'POST':
        form = DeviceForm(request.POST)
        print(request.POST)
        if form.is_valid():
            data = form.cleaned_data
            device = Device(**data)
            prediction = 0  
            return JsonResponse({'price_range': prediction})
    else:
        form = DeviceForm()
    return render(request, 'predictDevicePrice/predictDevicePrice.html', {'form': form})
from django.views.decorators.csrf import csrf_exempt
from django.http import JsonResponse
import json

 
from django.views.decorators.csrf import csrf_exempt
from django.http import JsonResponse
import json

@csrf_exempt
def predict(request):
    
    if request.method == 'POST':
        try:
            data = json.loads(request.body)
            print(data)
            # Your prediction logic here
            
            
            prediction = loaded_model.predict([list(data.values()) ])[0]
            print(prediction)
           # Example prediction
            return JsonResponse({'prediction': int(prediction)})
        except Exception as e:
            print(e)
            return JsonResponse({'error': str(e)}, status=500)
    return JsonResponse({'error': 'Invalid request method'}, status=400)
