import React from 'react';
import '../Stylesheets/mystyle.css';

const percentToDecimal = (decimal) => {
    return (decimal.toFixed(2) + '%');  // Multiply by 100 to convert to percentage
};

const calcScore = (total, goal) => {
    return percentToDecimal(total / goal);
};

export const CalculateScore = ({ Name, School, total, goal }) => (
    <div className="score-card">
        <h1>Student Details</h1>
        <div className="detail-row">
            <span className="detail-label">Name:</span>
            <span className="detail-value">{Name}</span>
        </div>
        <div className="detail-row">
            <span className="detail-label">School:</span>
            <span className="detail-value">{School}</span>
        </div>
        <div className="detail-row">
            <span className="detail-label">Total:</span>
            <span className="detail-value">{total} Marks</span>
        </div>
        <div className="detail-row score-row">
            <span className="detail-label">Score:</span>
            <span className="detail-value score-value">
                {calcScore(total, goal)}
            </span>
        </div>
    </div>
);