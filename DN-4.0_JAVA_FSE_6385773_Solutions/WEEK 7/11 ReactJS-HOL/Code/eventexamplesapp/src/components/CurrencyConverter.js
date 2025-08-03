import React, { useState } from 'react';

function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('EUR');
  const [convertedAmount, setConvertedAmount] = useState(null);

  // Example static conversion rate: 1 INR = 0.011 EUR (as of now)
  const conversionRates = {
    EUR: 0.011,
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (amount && conversionRates[currency]) {
      const result = amount * conversionRates[currency];
      setConvertedAmount(result.toFixed(2));

      alert( 'coverted to eruo amount is ' + result);
    }
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount (INR): </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            required
          />
        </div>
        <div style={{ margin: '10px 0' }}>
          <label>Convert to: </label>
          <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
            <option value="EUR">Euro (EUR)</option>
            {/* You can add more options here */}
          </select>
        </div>
        <button type="submit">Convert</button>
      </form>

      {convertedAmount !== null && (
        <h3 style={{ marginTop: '20px' }}>
          {amount} INR = {convertedAmount} {currency}
        </h3>
      )}
    </div>
  );
}

export default CurrencyConverter;
