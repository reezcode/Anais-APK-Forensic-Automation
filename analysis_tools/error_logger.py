#!/usr/bin/env python3
"""
Error Logging Utility
Centralized error logging for analysis tools
"""

import sys
import logging
from pathlib import Path
from datetime import datetime

class AnalysisLogger:
    """Logger for analysis tools with file and console output"""
    
    def __init__(self, tool_name, log_file=None, verbose=False):
        self.tool_name = tool_name
        self.verbose = verbose
        
        # Default log file
        if log_file is None:
            script_dir = Path(__file__).parent.parent
            log_file = script_dir / 'analysis_errors.log'
        
        self.log_file = Path(log_file)
        
        # Setup file logging
        self.file_logger = logging.getLogger(f'{tool_name}_file')
        self.file_logger.setLevel(logging.DEBUG)
        
        # File handler - logs everything
        if not self.file_logger.handlers:
            fh = logging.FileHandler(self.log_file, encoding='utf-8')
            fh.setLevel(logging.DEBUG)
            formatter = logging.Formatter(
                '[%(asctime)s] [%(name)s] [%(levelname)s] %(message)s',
                datefmt='%Y-%m-%d %H:%M:%S'
            )
            fh.setFormatter(formatter)
            self.file_logger.addHandler(fh)
    
    def info(self, message):
        """Log info message"""
        if self.verbose:
            print(f"[INFO] {message}", file=sys.stderr)
        self.file_logger.info(message)
    
    def warning(self, message):
        """Log warning - show brief message, log details"""
        print(f"[WARNING] {message}", file=sys.stderr)
        self.file_logger.warning(message)
    
    def error(self, message, detail=None):
        """Log error - show brief message, log full details to file"""
        print(f"[ERROR] {message}", file=sys.stderr)
        self.file_logger.error(message)
        
        if detail:
            self.file_logger.error(f"Error details: {detail}")
    
    def exception(self, message, exc_info=True):
        """Log exception with traceback to file only"""
        print(f"[ERROR] {message} (details in {self.log_file})", file=sys.stderr)
        self.file_logger.exception(message, exc_info=exc_info)
    
    def critical(self, message, detail=None):
        """Log critical error"""
        print(f"[CRITICAL] {message}", file=sys.stderr)
        self.file_logger.critical(message)
        
        if detail:
            self.file_logger.critical(f"Critical details: {detail}")

def setup_logger(tool_name, log_file=None, verbose=False):
    """Setup and return logger instance"""
    return AnalysisLogger(tool_name, log_file, verbose)
